import java.util.*;

public class HelloTrainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> questions = new ArrayList<>();
        questions.add("How do you feel about picking a life long partner?");
        questions.add("Are you worried that you won't be strong enough?");
        questions.add("Would you like any super potions on your journey?");
        questions.add("You're a child. What can you possibly do?");
        
        List<String> responses = new ArrayList<>();
        responses.add("Don't worry. Whoever you choose, they will support you.");
        responses.add("You won't know unless you try your best!");
        responses.add("It's useful in sticky situations!");
        responses.add("It is in your best interest to tread carefully.");

        System.out.println("Hello Trainer. Let's see what you are capable of.");

        int sum = 0;
        HelloTrainer helloTrainer = new HelloTrainer();

        // Iterate through the list of questions and responses
        for (int i = 0; i < questions.size(); i++) {
            String question = questions.get(i);
            String response = responses.get(i);

            System.out.println(question);
            System.out.println("Enter value");
            int value = scanner.nextInt();

            if (value > 3) {
                System.out.println(response);
            }
            sum += value; // Update sum with the current value
        }
        if (sum < 16){
        System.out.println("You are the chosen one, you are ready!");
        }else{
        System.out.println("Oh dear! You are so stressed! Here! Have a magical one way ticket to the end!");
        }
    }
}
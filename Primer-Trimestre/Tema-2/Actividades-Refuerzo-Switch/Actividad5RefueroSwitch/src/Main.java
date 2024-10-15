import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 1;
        int num;
        String result = "El juego más jugado es: ";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre el 1 y el 10: ");
        num = sc.nextInt();

        if(num >= 1 && num <= 10) {
            result += switch (num) {
                case 1 -> {
                    yield "Minecraft";
                }
                case 2 -> {
                    yield "Grand Theft Auto V";
                }
                case 3 -> {
                    yield "Fortnite";
                }
                case 4 -> {
                    yield "Roblox";
                }
                case 5 -> {
                    yield "Call of Duty: Modern Warfare II/Warzone 2.0";
                }
                case 6 -> {
                    yield "The Sims 4";
                }
                case 7 -> {
                    yield "League of Legends";
                }
                case 8 -> {
                    yield "Counter-Strike: Global Offensive";
                }
                case 9 -> {
                    yield "Valorant";
                }
                case 10 -> {
                    yield "Grand Theft Auto: Online";
                }
                default -> {
                    yield null;
                }
            };

            System.out.println(result);
        }
        else System.out.println("Error: El número introducido no es válido.");
    }
}
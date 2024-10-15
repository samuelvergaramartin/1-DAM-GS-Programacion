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
            if(switchType == 1) {
                switch (num) {
                    case 1: result+= "Minecraft";
                    break;
                    case 2: result += "Grand Theft Auto V";
                    break;
                    case 3: result += "Fortnite";
                    break;
                    case 4: result+= "Roblox";
                    break;
                    case 5: result += "Call of Duty: Modern Warfare II/Warzone 2.0";
                    break;
                    case 6: result += "The Sims 4";
                    break;
                    case 7: result += "League of Legends";
                    break;
                    case 8: result += "Counter-Strike: Global Offensive";
                    break;
                    case 9: result += "Valorant";
                    break;
                    case 10: result += "Grand Theft Auto: Online";
                    break;
                }
            }
            else {
                switch (num) {
                    case 1 -> result+= "Minecraft";
                    case 2 -> result += "Grand Theft Auto V";
                    case 3 -> result += "Fortnite";
                    case 4 -> result+= "Roblox";
                    case 5 -> result += "Call of Duty: Modern Warfare II/Warzone 2.0";
                    case 6 -> result += "The Sims 4";
                    case 7 -> result += "League of Legends";
                    case 8 -> result += "Counter-Strike: Global Offensive";
                    case 9 -> result += "Valorant";
                    case 10 -> result += "Grand Theft Auto: Online";
                }
            }

            System.out.println(result);
        }
        else System.out.println("Error: El número introducido no es válido.");
    }
}
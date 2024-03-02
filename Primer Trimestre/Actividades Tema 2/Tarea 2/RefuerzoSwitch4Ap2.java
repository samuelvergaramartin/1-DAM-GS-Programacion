/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class RefuerzoSwitch4Ap2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero del 1 al 10: ");
        num = sc.nextInt();

        String choice = switch(num) {
            case 1 -> {
                yield "Minecraft";
            }
            case 2 -> {
                yield "Grand Theft Auto V";
            }
            case 3 -> {
                yield "Fornite";
            }
            case 4 -> {
                yield "Roblox";
            }
            case 5 -> {
                yield "Call od Duty: Modern Warfare 2/Warzone 2.0";
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
                yield "Minecraft";
            }
            case 10 -> {
                yield "Grand Theft Auto: Online";
            }
            default -> {
                yield "ERROR: El numero introducido debe ser entre el 1 y el 10";
            }
        };

        System.out.println(choice);
        sc.close();
        if(choice == "ERROR: El numero introducido debe ser entre el 1 y el 10") {
            System.exit(1);
        }
        else {
            System.exit(0);
        }
    }
}

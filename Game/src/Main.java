public class Main {
    public static void main(String[] args) {


        int i = 1;
        boolean amLeben = true;

        while (amLeben) {
            if (i == 1) {
                //hir arbeitet Elias
                System.out.println("Hello Warrior");
                System.out.println("are you doing good? (y/n) : ");
                String greeting = IO.readln();
                if (greeting.equals("y")) {
                    System.out.println("thats nice to hear!");
                } else if (greeting.equals("n")) {
                    System.out.println("sad to hear that 😢");
                } else {
                    System.out.println("well anyways");
                }
                System.out.println("welcome to the arena of colossal. Brave warrion, we ask you to entertain those gloryous nobles with you strategetic fighting abilitys. ");


            } else {
                //hir arbeitet Jona


                System.out.println("Es Klappt!");

                int leben = 10;

                String Lenbensanzeige = switch (leben) {
                    case 1 -> "|";
                    case 2 -> "||";
                    case 3 -> "|||";
                    case 4 -> "||||";
                    case 5 -> "|||||";
                    case 6 -> "||||||";
                    case 7 -> "|||||||";
                    case 8 -> "||||||||";
                    case 9 -> "|||||||||";
                    case 10 -> "|||||||||||";
                    default -> "worng";
                };

                System.out.println(Lenbensanzeige);

                leben--;

                if (leben <= 0) {
                    amLeben = false;
                }



            }
        }

    }
}
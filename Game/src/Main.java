public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        int i = 0;

        boolean amLeben = true;

        while(amLeben == true) {

            if (i == 1) {
                //hir arbeitet Elias
                System.out.println("hello world");

            


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

                if(leben <= 0){
                    amLeben = false;

                }


            }
        }

    }
}
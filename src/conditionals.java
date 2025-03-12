public class conditionals {
    String question = "are you happy";

    public static void main(String[] args) {
        conditionals MagicEightBall = new conditionals();
    } //main method

    public conditionals(){
        System.out.println(question);
        int randomInt = (int)(Math.random()*11);
        System.out.println(randomInt);

        if(randomInt<2){
            System.out.println("Without a doubt");
        } if (randomInt>=2&&randomInt<=4) {
            System.out.println("Better not tell you now");
        } if (randomInt>4&&randomInt<6){
            System.out.println("Very doubtful");
        } if (randomInt>=6&&randomInt<8) {
            System.out.println("As I see it, yes");
        }if (randomInt>=8&&randomInt<=10){
            System.out.println("Definitly Yes!");

        }

    }
}
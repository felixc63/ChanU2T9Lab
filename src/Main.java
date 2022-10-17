public class Main {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++){
            int random = (int) (Math.random()*1000) + 1;
            System.out.println(Math.log(random));
        }
    }
}

public class Weather {
    public static void main(String [] args){
        if(args.length==0) {
            System.out.println("Please specify a location");
        }
        else {
            String location = args[0];
            int temperature = 25 + (int)(Math.random()*10);
            System.out.println("The weather in "+location+" is "+ temperature);
        }
    }
}
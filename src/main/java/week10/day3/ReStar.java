package week10.day3;

public class ReStar {
    public String getStar(int n){
        if(n == 0){
            return "";
        }
        return "*" + getStar(n-1);
    }

    public void printStar(int n){
        if(n == 0){
            return;
        }
        printStar(n-1);

    }

    public static void main(String[] args) {
        int n = 3;
        ReStar re = new ReStar();
        re.printStar(n-1);
        System.out.println(re.getStar(n));
    }
}

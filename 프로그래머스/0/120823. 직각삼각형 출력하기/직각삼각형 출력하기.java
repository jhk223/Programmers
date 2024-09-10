import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String star = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            star += "*";
        System.out.println(star);    
        }
        
    }
}
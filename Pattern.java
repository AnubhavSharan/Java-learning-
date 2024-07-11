public class Pattern {
    public static void main(String[] args) {
        System.out.print("*\n**\n***\n****"); //printing pattern in simple way without loop 
    }
}

class Pattern1{
    public static void main(String[] args) {
        for(int i=0; i<4; i++) {
            for(int j=0; j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2{
    public static void main(String[] args){
        int n=4;
        int m = 6;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 ||j==1 || i==n || j==m) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
}

class Pattern3{
    public static void main(String[] args){
        int n=5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern4{
    public static void main(String[] args){
        int n=5;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern5{
    public static void main(String[] args){
        int n=6;
        for (int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern6{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
//Advanced pattern
class Pattern7{
    public static void main(String[] args){
        int n=10;
        for(int i=1; i<=n;i++) {
            for(int j=1; j<=n; j++) {
                if(i==1|| i == n || j == 1 || j == n || i == j || j == (n-i+1)) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }}
            System.out.println();    
        }
            
    }
}

class Pattern8{
    public static void main(String[] args){
        int n=5;
        for(int i=n; i>=1;i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern9{
    public static void main(String[] args){
        int n=5;
        int num=1;
        for(int i=1; i<=n;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
            }
            
        }
    }

class Pattern10{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n;i++) {
                for(int j=1; j<=i; j++) {
                    int sum = i+j;
                    if(sum%2==0){
                        System.out.print("0");
                    }else{
                        System.out.print("1");
                    }
                }
                System.out.println();
                }
                
            }
        
}
    



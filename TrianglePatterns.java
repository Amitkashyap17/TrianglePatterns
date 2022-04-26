public class TrianglePatterns {
    public static void main(String[] args) {
        for (int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int n=65;

        for (int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print((char) n);
                n++;
            }
            System.out.println();
        }

        int m=65;

        for (int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print((char) m);
            }
            m++;
            System.out.println();
        }

        int l=1;

        for (int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print(l);
            }
            l++;
            System.out.println();
        }

        int k=1;

        for (int i=0; i<=3; i++){
            for (int j=0; j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}

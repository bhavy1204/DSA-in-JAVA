class MethodsBasics {
    int Product(int a, int b) {
        return a * b;
    }

    int factByRecu(int n) {
        return (n == 0) ? 1 : n * factByRecu(n - 1);
    }

    int factByLoop1(int n) {
        int res = 1;
        for (int i = n; i >=1; i--)
            res *= i;
        return res;
    }
    int factByLoop2(int n){
        int res =1;
        while (n>=1)
            res*=n--;
        return res;
    }
    int binomialCoff(int n,int r){
        return factByRecu(n)/(factByLoop1(r) *(factByLoop2(n-r)));
    }
    double sum(int a,int b){
        return a+b;
    }
    double sum(int a,float b,int c){
        return a+c+b;
    }
    double sum(double a ,double b){
        return a+b;
    }
    Boolean isPrime(int n){
        if(n==1 || n==2) return true;
        for (int i =2; i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    Boolean isPrime2(int n){
        if(n==1 || n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    void primeInRange(int start,int end){
            for(int i =start;i<end;i++){
                if(isPrime2(i))
                    System.out.print(i+" ");
            }
    }
    public static void main(String[] args) {
        MethodsBasics obj = new MethodsBasics();
        System.out.println(obj.Product(10, 20));
        System.out.println(obj.factByRecu(5));
        System.out.println(obj.factByLoop1(5));
        System.out.println(obj.factByLoop2(5));
        System.out.println(obj.binomialCoff(5, 2));
        System.out.println("------------ METHOD OVERLOADING ------------");
        System.out.println(obj.sum(10,20));
        System.out.println(obj.sum(10,(float)(32.12),43));
        System.out.println(obj.sum(32.65,54.86));
        System.out.println("isPrime : 5 : "+ (obj.isPrime(5) ? "YES" : "NO") );
        System.out.println("isPrime : 7 : "+ (obj.isPrime(7) ? "YES" : "NO") );
        System.out.println("isPrime : 10 : "+ (obj.isPrime(10) ? "YES" : "NO") );
        System.out.println("-----");
        System.out.println("isPrime2 : 5 : "+ (obj.isPrime2(5) ? "YES" : "NO") );
        System.out.println("isPrime2 : 7 : "+ (obj.isPrime2(7) ? "YES" : "NO") );
        System.out.println("isPrime2 : 10 : "+ (obj.isPrime2(10) ? "YES" : "NO") );
        System.out.println("-PRIME IN RANGE FROM 1 TO 20---------");
        obj.primeInRange(10, 20);
    }
}

class LL2{
    int val ;
    LL2 next;

    LL2(int n){
        this.val = n;
    }
    public static LL2 RemoveNthNode(LL2 head , int n){
        LL2 dummy = new LL2(0);

        dummy.next = head;
        LL2 first = dummy;
        LL2 second = dummy;

        for(int i = 0 ; i<= n ; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        //return dummy.next;
        second.next = second.next.next;
        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    }
}

class Primes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strNumber = input.split("");
        int[] Number = new int[strNumber.length];

        for(int i = 1 ; i<strNumber.length ; i++){
            Number[i] = Integer.parseInt(strNumber[i]);
        }

        System.out.println("enter the decaration");
        for(int num : Number){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2 ; i<= Math.sqrt(num) ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}





























































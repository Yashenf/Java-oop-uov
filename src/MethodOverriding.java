class Super{
    double getInterest(double amount){
        System.out.println("Super class method");
        return (amount / 100) * 15;
    }
}

class Sub extends Super{
    double getInterest(double amount){
        System.out.println("Sub class method");
        return (amount / 100) * 15;
    }
}


class MethodOverriding {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.getInterest(100));

    }
}

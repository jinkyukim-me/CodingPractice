package packageex.practice;

class DefaultPr {
    String id;
    String name;

    DefaultPr(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void run() {
        System.out.println("running");
    }
}

class DefaultPr1 {
    public static void main(String[] args) {
        DefaultPr dp = new DefaultPr("tiger", "jayden");
        dp.run();
    }


}


public class Bird {
    //フィールド
    private String name;
    private int age;
    private String sex;

    //コンストラクタ
    public static final String type = "bird";
    public Bird(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    //メソッド
    public void twitter(){
        System.out.println("ちゅんちゅん！！");
    }
}

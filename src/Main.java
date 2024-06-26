//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int myMax = service.max(5, 6);
        System.out.println(myMax);

        }
    }

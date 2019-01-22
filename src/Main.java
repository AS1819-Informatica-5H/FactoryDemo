import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        
        for (AnimalEnum e : AnimalEnum.values()) {
        	 System.out.println("Il verso e' "+ factory.getAnimal(e).getCall());
        }
         
        List<AnimalEnum> x=Arrays.asList(AnimalEnum.values());
        System.out.println(x.getClass().getName());
        
        Arrays.asList(AnimalEnum.values()).forEach(type->System.out.println("Valore "+type.toString()));
        Arrays.asList(AnimalEnum.values()).forEach(type->System.out.println("Il verso e' "+ factory.getAnimal(type).getCall()));
        
//        Arrays.stream(AnimalEnum.values()).forEach(
//                type-> System.out.println("Il verso e' "+ factory.getAnimal(type).getCall()));
    }
}
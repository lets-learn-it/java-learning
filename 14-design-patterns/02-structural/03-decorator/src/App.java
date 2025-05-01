interface Coffee {
    double cost();

    String description();
}


class PlainCoffee implements Coffee {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Plain coffee";
    }
}


abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost();
    }

    public String description() {
        return coffee.description();
    }
}


class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return super.cost() + 5;
    }

    public String description() {
        return super.description() + ", Milk";
    }
}


class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return super.cost() + 2;
    }

    public String description() {
        return super.description() + ", Sugar";
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.description() + " Rs. " + coffee.cost());

        coffee = new WithMilk(coffee);
        coffee = new WithSugar(coffee);
        System.out.println(coffee.description() + " Rs. " + coffee.cost());
    }
}

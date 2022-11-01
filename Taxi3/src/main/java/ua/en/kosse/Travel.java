package ua.en.kosse;

import java.util.List;

import static ua.en.kosse.Driver.km;
import static ua.en.kosse.Driver.wt;


public class Travel {
    public List<Double> distans; // дистанція
    public List<Integer> wait; // простой
    public Taxi taxi;

    public Travel(List<Double> distans, List<Integer> wait, Taxi taxi) {
        this.distans = distans;
        this.wait = wait;
        this.taxi = taxi;
    }

    public List<Double> getDistans() {
        return distans;
    }

    public void setDistans(List<Double> distans) {
        this.distans = distans;
    }

    public void setAddDistans(Double d) {
        this.distans.add(d);
    }

    public List<Integer> getWait() {
        return wait;
    }

    public void setWait(List<Integer> wait) {
        this.wait = wait;
    }

    public void setAddWait(Integer w) {
        this.wait.add(w);
    }

    public void reisen(Travel travel) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += travel.getDistans().get(i) * km * taxi.get_class_koef()+travel.getWait().get(i)*wt*taxi.get_class_koef();
        }
        System.out.println("Ціна проізду на таксі № " + travel.taxi.getNumber() + " класс '" + travel.taxi.getClass_auto() +
               "' марка авто '"+travel.taxi.getName()+ "' складає " + sum);
    }


}

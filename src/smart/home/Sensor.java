/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.home;

import java.io.Serializable;

/**
 *
 * @author suryasdwivedi
 */
public class Sensor implements Serializable {

private double value;

public Sensor(){
    value=Math.random();
}

public double get_value(){
    return 100*value;
}

public double refresh_value(){
    value=Math.random();
    return 100*value;
}

}

package apo2.ui;
import apo2.model.InfraestructureDeparment;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String resource = Main.class.getClassLoader().getResource(InfraestructureDeparment.BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        System.out.println(file.exists() + " " + resource);


    }

}


































































































package apo2.model;

import apo2.ui.Main;
import apo2.model.billboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InfraestructureDeparment {

    public static final String BILLBOARD_FILE_NAME = "BillboardDataExported.csv";

    private ArrayList<billboard> billboards;

    public InfraestructureDeparment() throws Exception {
        billboards = new ArrayList<>();
        loadBillboard();
    }

    public void addBillboard(double w, double h, boolean ui, String b) {


    }

    private void saveBillboard() {

    }

    private void loadBillboard() throws Exception {
        String resource = Main.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        line = br.readLine();
        while (line != null) {
            importData(line);
            line = br.readLine();
        }

        br.close();
        fr.close();

    }

    public void exportDangerousBillboardReport(String fn) {

    }

    public void importData(String fn) {
        String[] columns = fn.split("\\|");
        //System.out.println(Arrays.toString(columns));
        billboard billboard = new billboard(Double.parseDouble(columns[0]), Double.parseDouble(columns[1]), Boolean.parseBoolean(columns[2]), columns[3]);
        billboards.add(billboard);
    }

    public double avarageH() {

        double acumulate = 0;

        for (int i = 0; i < billboards.size(); ++i) {

            acumulate = billboards.get(i).getHeight();


        }
        double av = acumulate / billboards.size();

        return av;

    }

    public double avarageW() {

        double acumulateW = 0;

        for (int i = 0; i < billboards.size(); ++i) {

            acumulateW = billboards.get(i).getWidth();
        }
        double avW = acumulateW / billboards.size();

        return avW;
    }

    public double avarageA() {

        double acumulateA = 0;

        for (int i = 0; i < billboards.size(); ++i) {

            acumulateA = billboards.get(i).getArea();


        }
        double avA = acumulateA / billboards.size();

        return avA;
    }

    @Override
    public String toString() {

        return null;
    }
}
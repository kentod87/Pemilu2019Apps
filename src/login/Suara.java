/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.ArrayList;

/**
 *
 * @author Amru Fakharullah
 */
public class Suara {
    public ArrayList kpuPres(){
    ArrayList<pres> list = new ArrayList<pres>();
    pres p1 = new pres("Aceh","398,222","2,358,078");
     pres p2 = new pres("Sumut","3.893.132","3.558.424");
      pres p3 = new pres("Sumbar","407.638","2.485.265");
       pres p4 = new pres("Riau","1.246.888","1.973.298");
        pres p5 = new pres("Jambi","858.738 ","1.200.255");
         pres p6 = new pres("Sumsel","1.915.488 ","2.830.326");
          pres p7 = new pres("Bengkulu","582.845","585.598");
           pres p8 = new pres("Babel","495.500","288.097");
            pres p9 = new pres("Lampung","2.845.798 ","1.951.645");
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            list.add(p5);
            list.add(p6);
            list.add(p7);
            list.add(p8);
            list.add(p9);
        return list;
    }
    
     public ArrayList surpePres(){
    ArrayList<pres> list = new ArrayList<pres>();
    pres p1 = new pres("Aceh","1892","5987");
     pres p2 = new pres("Sumut","3.893","3.558");
      pres p3 = new pres("Sumbar","4.076","24.852");
       pres p4 = new pres("Riau","1246","19.732");
        pres p5 = new pres("Jambi","85.878 ","120.025");
         pres p6 = new pres("Sumsel","9.154","283.032");
          pres p7 = new pres("Bengkulu","5.828","58.598");
           pres p8 = new pres("Babel","4.955","2.880");
            pres p9 = new pres("Lampung","84.579 ","51.645");
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            list.add(p5);
            list.add(p6);
            list.add(p7);
            list.add(p8);
            list.add(p9);
        return list;
    }
     
      public ArrayList dpd(){
    ArrayList<dpd1> list = new ArrayList<dpd1>();
    dpd1 p1 = new dpd1("Aceh","FACHRUL RAZI, M.I.P.");
    dpd1 p2 = new dpd1("","Drs. H. GHAZALI ABBAS ADAN");
    dpd1 p3 = new dpd1("","SUDIRMAN");
    dpd1 p4 = new dpd1("","RAFLI");
    dpd1 p5 = new dpd1("Sumut","Prof. Dr. Ir. Hj. DARMAYANTI LUBIS");
    dpd1 p6 = new dpd1("","Drs. H. RIJAL SIRAIT");
    dpd1 p7 = new dpd1("","PARLINDUNGAN PURBA, S.H., M.M.");
    dpd1 p8 = new dpd1("","DEDI ISKANDAR BATUBARA, S.Sos., S.H., M.S.P.");
   
    
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);
    list.add(p6);
    list.add(p7);
    list.add(p8);
   
    return list;
    }
}

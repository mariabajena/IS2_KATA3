package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    private Histogram histogram;
    
    public HistogramDisplay(Histogram histogram) {
        super("HISTOGRAM");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram JFreeChart", "Dominios email", "Numero de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
       /* 
        for (Object key: histogram.keySet()){
            dataSet.addValue(histogram.get(key), "", key.toString());
        }
        */
        
        dataSet.addValue(300, "", "ulpgc.es");
        dataSet.addValue(600, "", "gmail.es");
        dataSet.addValue(200, "", "dis.ulpgc.es");
        dataSet.addValue(300, "", "poczta.es");
        dataSet.addValue(700, "", "inny.es");
        dataSet.addValue(500, "", "cosjeszcze.es");
        
        
        return dataSet;
    }
}

package edu.kis.powp.jobs2d.drivers.adapter;



import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    public LineDrawerAdapter() {
        super();
    }

    @Override
    public void setPosition(int xAxis, int yAxis) {
        startX=xAxis;
        startY=yAxis;
    }

    @Override
    public void operateTo(int xAxis, int yAxis) {
        ILine line = LineFactory.getDottedLine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(xAxis, yAxis);
        DrawPanelController drawPanelController = DrawerFeature.getDrawerController();
        drawPanelController.drawLine(line);
        setPosition(xAxis,yAxis);
    }
}

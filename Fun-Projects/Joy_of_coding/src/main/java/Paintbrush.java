import java.awt.*;

public class Paintbrush {

    private static final Color ALIZARIN_CRIMSON = new Color(78, 21, 0);
    private static final Color BRIGHT_RED = new Color(219, 0, 0);
    private static final Color CADMIUM_YELLOW = new Color(255, 236, 0);
    private static final Color DARK_SIENNA = new Color(95, 46, 31);
    private static final Color INDIAN_YELLOW = new Color(255, 184, 0);
    private static final Color MIDNIGHT_BLACK = new Color(0, 0, 0);
    private static final Color PHTHALO_BLUE = new Color(12, 0, 64);
    private static final Color PHTHALO_GREEN = new Color(16, 46, 60);
    private static final Color PRUSSIAN_BLUE = new Color(2, 30, 68);
    private static final Color SAP_GREEN = new Color(10, 52, 16);
    private static final Color TITANIUM_WHITE = new Color(255, 255, 255);
    private static final Color VAN_DYKE_BROWN = new Color(34, 27, 21);
    private static final Color YELLOW_OCHRE = new Color(199, 155, 0);

    private Graphics g;

    public Paintbrush(Graphics graphics) {
        g = graphics;
    }

    public void drawSky() {
        //sky
        Color skyBlend = blendTwo(PRUSSIAN_BLUE, TITANIUM_WHITE, 0.2f);
        g.setColor(skyBlend);
        g.fillRect(0, 0, 1000, 300);

        //sun
        g.setColor(new Color(168, 235, 52));
        g.fillOval(700, 50, 130, 130);

        //cloud
        g.setColor(TITANIUM_WHITE);
        g.fillOval(200, 130, 75, 75);
        g.fillOval(127, 85, 120, 120);
        g.fillOval(90, 115, 75, 75);
    }

    public void drawMountains() {
        Color mountainBlend1 = blendTwo(VAN_DYKE_BROWN, ALIZARIN_CRIMSON, 0.25f);
        g.setColor(mountainBlend1);
        Polygon singleMountain = new Polygon();
        singleMountain.addPoint(75, 500);
        singleMountain.addPoint(300, 100);
        singleMountain.addPoint(650, 485);
        g.fillPolygon(singleMountain);

        Color mountainBlend2 = blendTwo(VAN_DYKE_BROWN, YELLOW_OCHRE, 0.25f);
        g.setColor(mountainBlend2);
        Polygon doubleMountain = new Polygon();
        doubleMountain.addPoint(350, 490);
        doubleMountain.addPoint(500, 145);
        doubleMountain.addPoint(600, 310);
        doubleMountain.addPoint(700, 165);
        doubleMountain.addPoint(850, 510);
        g.fillPolygon(doubleMountain);
    }

    public Color blendTwo(Color c1, Color c2, float ratio) {
        if (ratio > 1f) ratio = 1f;
        else if (ratio < 0f) ratio = 0f;
        float iRatio = 1.0f - ratio;

        int i1 = c1.getRGB();
        int i2 = c2.getRGB();

        int a1 = (i1 >> 24 & 0xff);
        int r1 = ((i1 & 0xff0000) >> 16);
        int g1 = ((i1 & 0xff00) >> 8);
        int b1 = (i1 & 0xff);

        int a2 = (i2 >> 24 & 0xff);
        int r2 = ((i2 & 0xff0000) >> 16);
        int g2 = ((i2 & 0xff00) >> 8);
        int b2 = (i2 & 0xff);

        int a = (int)((a1 * iRatio) + (a2 * ratio));
        int r = (int)((r1 * iRatio) + (r2 * ratio));
        int g = (int)((g1 * iRatio) + (g2 * ratio));
        int b = (int)((b1 * iRatio) + (b2 * ratio));

        return new Color( a << 24 | r << 16 | g << 8 | b );
    }

    public Color blendThree(Color c1, Color c2, Color c3, float ratio) {
        if (ratio > 1f) ratio = 1f;
        else if (ratio < 0f) ratio = 0f;
        float iRatio = 1.0f - ratio;

        int i1 = c1.getRGB();
        int i2 = c2.getRGB();
        int i3 = c3.getRGB();

        int a1 = (i1 >> 24 & 0xff);
        int r1 = ((i1 & 0xff0000) >> 16);
        int g1 = ((i1 & 0xff00) >> 8);
        int b1 = (i1 & 0xff);

        int a2 = (i2 >> 24 & 0xff);
        int r2 = ((i2 & 0xff0000) >> 16);
        int g2 = ((i2 & 0xff00) >> 8);
        int b2 = (i2 & 0xff);

        int a3 = (i3 >> 24 & 0xff);
        int r3 = ((i3 & 0xff0000) >> 16);
        int g3 = ((i3 & 0xff00) >> 8);
        int b3 = (i3 & 0xff);

        int a = (int)((a1 * iRatio) + (a2 * ratio));
        int r = (int)((r1 * iRatio) + (r2 * ratio));
        int g = (int)((g1 * iRatio) + (g2 * ratio));
        int b = (int)((b1 * iRatio) + (b2 * ratio));

        return new Color( a << 24 | r << 16 | g << 8 | b );
    }

}
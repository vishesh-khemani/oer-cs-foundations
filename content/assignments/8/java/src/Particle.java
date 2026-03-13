public class Particle {
    public static int numParticlesConstructed = 0;

    public Particle(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        ++numParticlesConstructed;
    }

    public double x, y; // Position
    public double vx, vy; // Velocity
}

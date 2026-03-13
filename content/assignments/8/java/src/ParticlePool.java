public class ParticlePool {
    /** Constructs a pool of count particles. */
    public ParticlePool(int count) {
        // TODO: implement the constructor
    }

    /**
     * Returns an available particle from the pool, or null if none are available.
     * The caller must call release on the particle when done using it.
     */
    public Particle acquire(double x, double y, double vx, double vy) {
        // TODO: implement the acquire logic without any new memory allocations. This
        // should
        // run in O(1) time.
        return new Particle(x, y, vx, vy); // Placeholder return statement
    }

    /**
     * Returns a particle to the pool (previously obtained by calling acquire)
     * and makes it available for reuse in a future acquire call.
     */
    public void release(Particle p) {
        // TODO: implement the release logic without any memory deallocations. This
        // should run in O(1) time.
    }

    // TODO: define member variables as needed
}

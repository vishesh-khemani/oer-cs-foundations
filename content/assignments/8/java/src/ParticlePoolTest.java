import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParticlePoolTest {

    @Test
    public void testPool() {
        final int maxParticles = 2;
        ParticlePool pool = new ParticlePool(maxParticles);
        assertEquals(maxParticles, Particle.numParticlesConstructed);

        Particle p1 = pool.acquire(0, 0, 1, 1);
        assertNotNull(p1);
        assertTrue(p1.x == 0 && p1.y == 0 && p1.vx == 1 && p1.vy == 1);
        assertEquals(maxParticles, Particle.numParticlesConstructed);

        Particle p2 = pool.acquire(1, 1, -1, -1);
        assertNotNull(p2);
        assertTrue(p2.x == 1 && p2.y == 1 && p2.vx == -1 && p2.vy == -1);
        assertEquals(maxParticles, Particle.numParticlesConstructed);

        Particle p3 = pool.acquire(2, 2, 0, 0);
        assertNull(p3); // pool is exhausted
        assertEquals(maxParticles, Particle.numParticlesConstructed);

        pool.release(p1);
        assertEquals(maxParticles, Particle.numParticlesConstructed);

        p3 = pool.acquire(2, 2, 0, 0);
        assertNotNull(p3);
        assertTrue(p3.x == 2 && p3.y == 2 && p3.vx == 0 && p3.vy == 0);
        assertEquals(maxParticles, Particle.numParticlesConstructed); // no new particle constructed

        pool.release(p2);
        pool.release(p3);
        assertEquals(maxParticles, Particle.numParticlesConstructed);
    }
}

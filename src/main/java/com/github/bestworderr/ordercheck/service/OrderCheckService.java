package com.github.bestworderr.ordercheck.service;

import java.awt.image.BufferedImage;

/**
 * Service for comparing order check.
 */
public interface OrderCheckService {

    /**
     * Compare two images
     *
     * @param actual actual {@link BufferedImage}.
     * @param expected expected {@link BufferedImage}.
     *
     * @return true if they are match, false - otherwise.
     */
    boolean compare(BufferedImage actual, BufferedImage expected);
}

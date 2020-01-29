package com.github.bestworderr.ordercheck.service;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import java.awt.image.BufferedImage;

/**
 * {@inheritDoc}
 */
public class OrderCheckServiceImpl implements OrderCheckService {

    /**
     * {@inheritDoc}
     */
    public boolean compare(BufferedImage expected, BufferedImage actual) {
        ImageComparisonResult imageComparisonResult = new ImageComparison(expected, actual).compareImages();
        return ImageComparisonState.MATCH == imageComparisonResult.getImageComparisonState();
    }
}

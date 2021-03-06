/*
 BlueFlyVario flight instrument - http://www.alistairdickie.com/blueflyvario/
 Copyright (C) 2011-2012 Alistair Dickie

 BlueFlyVario is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 BlueFlyVario is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with BlueFlyVario.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.bfv.util;

public class ArrayUtil {
    public static double[] getMaxValue(double[] val) {
        double max = Double.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < val.length; i++) {
            double v = val[i];
            if (v > max) {
                max = v;
                index = i;
            }
        }
        return new double[]{max, index};

    }

    public static double[] getMinValue(double[] val) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < val.length; i++) {
            double v = val[i];
            if (v < min) {
                min = v;
                index = i;
            }
        }
        return new double[]{min, index};

    }

    public static double[] copy(double[] dataToCopy) {
        if (dataToCopy == null) {
            return null;
        }

        double[] ret = new double[dataToCopy.length];
        System.arraycopy(dataToCopy, 0, ret, 0, dataToCopy.length);

        return ret;
    }
}

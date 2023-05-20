package beam232001.monerominer9000.miner;

import android.os.Binder;

public abstract class AbstractMiningServiceBinder extends Binder {
    /**
     * Return mining service from the binder
     * @return
     */
    public abstract AbstractMiningService getService();
}

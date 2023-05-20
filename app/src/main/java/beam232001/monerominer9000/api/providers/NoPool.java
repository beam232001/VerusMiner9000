// Copyright (c) 2020, Scala
//
// Please see the included LICENSE file for more information.

package beam232001.monerominer9000.api.providers;

import beam232001.monerominer9000.api.ProviderAbstract;
import beam232001.monerominer9000.api.PoolItem;

public final class NoPool extends ProviderAbstract {

    public NoPool(PoolItem poolItem){
        super(poolItem);
    }

    @Override
    protected void onBackgroundFetchData() {}
}

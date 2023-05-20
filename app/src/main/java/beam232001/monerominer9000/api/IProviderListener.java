// Copyright (c) 2020, Scala
//
// Please see the included LICENSE file for more information.

package beam232001.monerominer9000.api;

public interface IProviderListener {
    void onStatsChange(ProviderData data);

    boolean onEnabledRequest();
}

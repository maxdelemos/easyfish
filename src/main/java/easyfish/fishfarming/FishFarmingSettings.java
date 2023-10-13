package easyfish.fishfarming;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("easyfish.fishfarming")
record FishFarmingSettings(int stockThreshold) {

    /**
     * Some Javadoc.
     *
     * @return
     */
    public int stockThreshold() {
        return stockThreshold;
    }
}
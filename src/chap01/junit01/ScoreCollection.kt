package chap01.junit01

class ScoreCollection {
    private val scores = ArrayList<Scoreable>();

    fun add(scoreable: Scoreable) {
        scores.add(scoreable)
    }

    fun arithmeticMean(): Int {
        val total = scores
            .stream()
            .mapToInt(Scoreable::getScore)
            .sum()
        return total / scores.size
    }

}
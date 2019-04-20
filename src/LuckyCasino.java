class LuckyCasino {
    int play(int winingChips, int allIns) {
        int bets = 0;
        while (winingChips > 1) {
            if (winingChips == 2) {
                return ++bets; // Note: betting just one chip is never considered playing all-in
            }
            if (allIns <= 0) {
                return bets + winingChips - 1; // фишку игрока не считаем
            }
            if (winingChips % 2 == 0) {
                winingChips /= 2;
                allIns--;
            } else {
                winingChips--;
            }
            bets++;
        }
        return bets;
    }
}

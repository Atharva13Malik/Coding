class Solution {
    public int reboundHeight(int H, int V, int Vn) {

        int ratio = V / Vn;

        int height = H * ratio * ratio;

        return height;
    }
}

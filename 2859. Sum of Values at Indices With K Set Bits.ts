function sumIndicesWithKSetBits(nums: number[], k: number): number {
    let ans = 0;

    // Find the binary representation of indices of the array.
    for (let i = 0; i < nums.length; i++) {
        let indexUnderTest = i;
        const binaryOfIndexUnderTest = Number(indexUnderTest).toString(2)

        let numOfSetBits = 0;
        for (let j = 0; j < binaryOfIndexUnderTest.length; j++) {
            if (binaryOfIndexUnderTest[j] == "1") {
                numOfSetBits++
            }
        }

        if (numOfSetBits === k) {
            ans += nums[indexUnderTest]
        }
    }

    return ans;
};
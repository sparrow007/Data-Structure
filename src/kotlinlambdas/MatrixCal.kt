package kotlinlambdas

class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val row = matrix.size
        val column = matrix[0].size

        val updatedRow = ArrayList<Int>()
        val updateCol = ArrayList<Int>()


        for (i in 0 until row) {
            for (j in 0 until column) {
                if (matrix[i][j] == 0) {
                    updatedRow.add(i)
                    updateCol.add(j)
                }
            }
        }

        for (i in 0 until updatedRow.size) {
            for (n in 0 until column) {
                matrix[updatedRow[i]][n] = 0
            }
        }

        for (j in 0 until updateCol.size) {
            for (m in 0 until row) {
                matrix[m][updateCol[j]] = 0
            }
        }


        val pascal = ArrayList<ArrayList<Int>>()

        for (i in 0 until 2) {
            if (i == 0) {
                pascal.add(arrayListOf(1))
                continue
            }

            val last = pascal[i - 1]

            for (j in 0 until i+1) {
                val update = ArrayList<Int>()
                if (j == 0) {
                    update.add(1)
                }

                if (j < last.size) {
                    val sum = last[j-1] + last[j]
                    update.add(sum)
                } else {
                    update.add(1)
                }
            }

        }


    }
}
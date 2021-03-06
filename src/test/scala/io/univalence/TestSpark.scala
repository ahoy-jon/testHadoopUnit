package io.univalence

import fr.jetoile.hadoopunit.HadoopUtils
import org.apache.spark.sql.SparkSession

object TestSpark {



  def main(args: Array[String]): Unit = {

    val instance = HadoopUtils.INSTANCE

    val ss = SparkSession.builder().master("local").appName("toto").getOrCreate()


    import ss.implicits._
    val ds = ss.createDataset(0 to 10)

    ds.collect().foreach(println)


    ss.stop()
    System.exit(0)

  }

}

package com.zyunf.springboot.util;

/**
 * @Author: Yunf
 * @Date: 2019/3/22 18:13
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.util
 */
public class TrimBank {
    public static void main(String[] args) {
        String data=" if (index(CP018) == 02 &&& index(CP102) != 1) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049)\n" +
                "        } else if (index(CP018) == 02 &&& index(CP102) == 1) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049) * index(F054)\n" +
                "        } else if (index(CP018) == 01 &&& index(CP019) == 1 &&& index(CP017) == 1 &&& index(CP022) <= 15 &&& CP002 != B01 &&& CP002 != B02) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049) * index(F064)\n" +
                "        } else if (index(CP018) == 01 &&& index(CP019) == 1 &&& index(CP017) != 1 &&& index(CP002) == B01) {\n" +
                "            if (index(F050) >= index(F063)) {\n" +
                "                Parameter(BasicWageParam | F999) * index(F012) * index(F049)\n" +
                "            } else {\n" +
                "                Parameter(BasicWageParam | F999) * index(F012) * index(F049) * index(CP103)\n" +
                "            }\n" +
                "        } else if (index(CP018) == 01 &&& index(CP019) == 1 &&& index(CP017) != 1 &&& CP002 == B02 &&& CP102 != 1) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049)\n" +
                "        } else if (index(CP018) == 01 &&& index(CP019) == 1 &&& index(CP017) != 1 &&& CP002 == B02 &&& CP102 == 1) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049) * index(F057)\n" +
                "        } else if (index(CP018 == 01 &&& index(CP019) == 1 &&& index(CP017) != 1 &&& index(CP002) != B01 &&& index(CP002) != B02 &&& index(CP102) != 1)) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049)\n" +
                "        } else if (index(CP018 == 01 &&& index(CP019) == 1 &&& index(CP017) != 1 &&& index(CP002) != B01 &&& index(CP002) != B02 &&& index(CP102) == 1)) {\n" +
                "            Parameter(BasicWageParam | F999) * index(F012) * index(F049) * index(F053)\n" +
                "        } else if (index(CP018) == 01 &&& index(CP019) == 1 &&& index(CP017) == 1 &&& index(CP022) > 15) {\n" +
                "            0\n" +
                "        }";
        data = data.replaceAll("\r|\n|\t", "");
        data=data.replaceAll(" ","" );
        data=data.replace("elseif","else if" );
        System.out.println(data);
    }


}

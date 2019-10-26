/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Calendar
        Calendar cal = Calendar.getInstance();

        //Variables
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get(Calendar.MONTH) + 1;
        int a = cal.get(Calendar.YEAR);

        //Mensaje
        System.out.printf("Fecha del sistema ...: %02d/%02d/%04d%n", d, m, a);

    }//main

}//class

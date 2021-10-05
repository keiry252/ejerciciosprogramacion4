package com.example.ejerciciosprogramacioniv

class Empleado {
    var nombre: String = ""
    var sueldo: Double = 0.0
    var area: String = ""
    var cargo: String = ""
    var tiempo: Int = 0


    constructor( nombre: String, sueldo: Double, area: String, cargo: String, tiempo: Int){

        this.nombre = nombre
        this.sueldo = sueldo
        this.area = area
        this.cargo = cargo
        this.tiempo = tiempo

        if (tiempo >= 5)
        {
            if (tiempo % 5 == 0)
            {
                var valor : Int = tiempo / 5
                var bono : Int = valor * 25
                var SueldoLiquido : Double = bono.toDouble() + sueldo


                if(sueldo < 0.0 && area == "" && cargo == ""){

                    println("$nombre")
                    println("$tiempo")
                    println("El sueldo no puede ser negativo")
                    println("el cargo y area no pueden quedar vacios")


                }
                else if(sueldo >= 0.0 && area == "" && cargo == ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$SueldoLiquido")
                    println(" el cargo y area no pueden quedar vacios")
                }
                else if(sueldo < 0.0 && area != "" && cargo == ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$area")
                    println("El sueldo no puede ser negativo")
                    println("el cargo no puede quedar vacio")
                }
                else if(sueldo < 0.0 && area == "" && cargo != ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$cargo")
                    println("El sueldo no puede ser negativo")
                    println(" el area no puede quedar vacio")
                }
                else if(sueldo >= 0.0 && area != "" && cargo == ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$SueldoLiquido")
                    println("$area")
                    println(" el cargo no puede quedar vacio")
                }
                else if(sueldo >= 0.0 && area == "" && cargo != ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$SueldoLiquido")
                    println("$cargo")
                    println(" el area no puede quedar vacio")
                }
                else if(sueldo < 0.0 && area != "" && cargo != ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$area")
                    println("$cargo")
                    println("El sueldo no puede ser negativo")
                }
                else if(sueldo >= 0.0 && area != "" && cargo != ""){

                    println("$nombre")
                    println("$tiempo")
                    println("$SueldoLiquido")
                    println("$area")
                    println("$cargo")

                }


            }
        }
        else if (tiempo < 5)
        {

            if(sueldo < 0.0 && area == "" && cargo == ""){

                println("$nombre")
                println("$tiempo")
                println("El sueldo no puede ser negativo")
                println("el cargo y area no pueden quedar vacios")



            }
            else if(sueldo >= 0.0 && area == "" && cargo == ""){

                println("$nombre")
                println("$tiempo")
                println("$sueldo")
                println(" el cargo y area no pueden quedar vacios")
            }
            else if(sueldo < 0.0 && area != "" && cargo == ""){

                println("$nombre")
                println("$tiempo")
                println("$area")
                println("El sueldo no puede ser negativo")
                println(" el cargo no puede quedar vacio")
            }
            else if(sueldo < 0.0 && area == "" && cargo != ""){

                println("$nombre")
                println("$tiempo")
                println("$cargo")
                println("El sueldo no puede ser negativo")
                println("el area no puede quedar vacio")
            }
            else if(sueldo >= 0.0 && area != "" && cargo == ""){

                println("$nombre")
                println("$tiempo")
                println("$sueldo")
                println("$area")
                println(" el cargo no puede quedar vacio")
            }
            else if(sueldo >= 0.0 && area == "" && cargo != ""){

                println("$nombre")
                println("$tiempo")
                println("$sueldo")
                println("$cargo")
                println(" el area no puede quedar vacio")
            }
            else if(sueldo < 0.0 && area != "" && cargo != ""){

                println("$nombre")
                println("$tiempo")
                println("$area")
                println("$cargo")
                println("El sueldo no puede ser negativo")
            }
            else if(sueldo >= 0.0 && area != "" && cargo != ""){

                println("$nombre")
                println("$tiempo")
                println("$sueldo")
                println("$area")
                println("$cargo")

            }


        }


    }



}
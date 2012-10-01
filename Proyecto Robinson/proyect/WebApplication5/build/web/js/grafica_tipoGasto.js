/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


  function graficaTipo(){
                           
                        var leerXML;
                        if(window.XMLHttpRequest)
                            {
                                leerXML=new XMLHttpRequest();
                               
                            }
                        else{
                            leerXML=new ActiveXObject("Microsoft.XMLHTTP");
                            
                        }
                             leerXML.open("get","xml/erick.xml",false); 
                       // leerXML.load("erick.xml");
                        leerXML.send();
                        
                        miXML=leerXML.responseXML;
                        
                        
                        
                       
                            
			//<!--empiezo a realizar la lectura del xml-->
                       
                      
                     
                         var nav= miXML.getElementsByTagName("tipo");
                          
                      
                        vivienda=parseInt(nav[0].getElementsByTagName("vivienda")[0].childNodes[0].nodeValue);
                        salud=parseInt(nav[0].getElementsByTagName("salud")[0].childNodes[0].nodeValue); 
                        otros=parseInt(nav[0].getElementsByTagName("otros")[0].childNodes[0].nodeValue);
                        educacion=parseInt(nav[0].getElementsByTagName("educacion")[0].childNodes[0].nodeValue);
                        vestimenta=parseInt(nav[0].getElementsByTagName("vestimenta")[0].childNodes[0].nodeValue);
                        alimentacion=parseInt(nav[0].getElementsByTagName("alimentacion")[0].childNodes[0].nodeValue);
                        
					chart = new Highcharts.Chart({   
								chart: {   
									renderTo: 'ahora',   
									plotBackgroundColor: null,   
									plotBorderWidth: null,   
									plotShadow: false 
								},   
								title: {   
									text: "gastos del anio 2009 tiposDeGastos"   
								},   
								tooltip: {   
									formatter: function() {   
										return '<b>'+ this.point.name +'</b>: '+ this.y +' %';   
									}   
								},   
								plotOptions: {   
									pie: {   
										allowPointSelect: true,   
									  cursor: 'pointer',   
										dataLabels: {   
											enabled: false   
										},   
										showInLegend: true   
									}   
								},   
								series: [{   
									type: 'pie',   
									name: 'Browser share',   
									data: [   
										['vivienda',  vivienda],   
										['salud',       salud],   
									   {   
											name: 'otros',       
											y: otros,   
											sliced: true,   
											selected: true   
										}, 
                                                                                ['educacion',  educacion],   
										['vestimenta',       vestimenta], 
                                                                                ['alimentacion',  alimentacion],   
										
										
									]   
								}]   
							}); }
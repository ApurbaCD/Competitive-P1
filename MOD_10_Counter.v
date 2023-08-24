module masterslave(j,k,q,qb,clr,clk);
input j,k,clr,clk;
output q,qb;
wire a,b,cbar,y,z,c,e;
nand(a,j,qb,clk,clr);
nand(y,z,a);
not(cbar,clk);
nand(c,cbar,y);
nand(q,c,qb);
nand(b,q,k,clk);
nand(z,y,clr,b);
nand(d,cbar,z);
nand(qb,clr,d,q);

endmodule
//////
module runmod10(q,qb,clr,clk);
input clr;
input clk;
output [3:0]q,qb;
nand(clr,q[3],q[1]);
masterslave ms1(1,1,q[0],qb[0],clr,clk);
masterslave ms2(1,1,q[1],qb[1],clr,q[0]);
masterslave ms3(1,1,q[2],qb[2],clr,q[1]);
masterslave ms4(1,1,q[3],qb[3],clr,q[2]);

endmodule
///firts time clk =0 (in clock after the word noforce) ;clr=0 (in force)
//after first time clr= noforce()
//complete

package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Collection;

public interface FlOt$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(FlOt$Bool.class,
		Clas_Rap.class);
	/*Dep done*/

	@Lin_DclAr
	boolean FlOt$Bool(float In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void FlOt$Bool(
			float[] From,
			boolean[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(FlOt$Bool(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default boolean[] FlOt$Bool(float[] In)
			{
				boolean[] Out=new boolean[In.length];
				FlOt$Bool(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void FlOt$Bool(
			Iterable<Float> From,
			Collection<Boolean> To)
		{
			for(float In:From)
			{To.add(FlOt$Bool(In));}
		}
}
// Date: 04.10.2015 20:54:36
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.hbm.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPoles extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
  
  public ModelPoles()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 16, 2);
      Shape1.setRotationPoint(-1F, 8F, 4F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 16, 2);
      Shape2.setRotationPoint(4F, 8F, -6F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 16, 2);
      Shape3.setRotationPoint(-6F, 8F, -6F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 41);
      Shape4.addBox(0F, -1F, 0F, 13, 1, 1);
      Shape4.setRotationPoint(-4F, 21F, -5.5F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, -0.7853982F);
      Shape5 = new ModelRenderer(this, 0, 41);
      Shape5.addBox(0F, 0F, 0F, 13, 1, 1);
      Shape5.setRotationPoint(4F, 21F, -5.5F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, -2.356194F);
      Shape6 = new ModelRenderer(this, 0, 18);
      Shape6.addBox(0F, -1F, 0F, 1, 1, 15);
      Shape6.setRotationPoint(-5.533333F, 21F, -4F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0.7853982F, 0.4886922F, 0F);
      Shape7 = new ModelRenderer(this, 0, 18);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 15);
      Shape7.setRotationPoint(-5.5F, 12F, -4F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, -0.7853982F, 0.4886922F, 0F);
      Shape8 = new ModelRenderer(this, 0, 18);
      Shape8.addBox(-1F, 0F, 0F, 1, 1, 15);
      Shape8.setRotationPoint(5.5F, 12F, -4F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, -0.7853982F, -0.4886922F, 0F);
      Shape9 = new ModelRenderer(this, 0, 18);
      Shape9.addBox(-1F, -1F, 0F, 1, 1, 15);
      Shape9.setRotationPoint(5.5F, 21F, -4F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0.7853982F, -0.4886922F, 0F);
  }
  
  @Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void renderModel(float f)
  {
	    Shape1.render(f);
	    Shape2.render(f);
	    Shape3.render(f);
	    Shape4.render(f);
	    Shape5.render(f);
	    Shape6.render(f);
	    Shape7.render(f);
	    Shape8.render(f);
	    Shape9.render(f);
  }
  
  @Override
public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  
}

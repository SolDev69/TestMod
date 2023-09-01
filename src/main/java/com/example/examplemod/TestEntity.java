package com.example.examplemod;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class TestEntity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "testentity"), "main");
	private final ModelPart bb_main;

	public TestEntity(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(62, 33).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 64).addBox(-1.0F, -11.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 64).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 11).addBox(3.0F, -11.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(3.0F, -11.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 53).addBox(3.0F, -11.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 62).addBox(-1.0F, -11.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 62).addBox(-5.0F, -11.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 42).addBox(-5.0F, -11.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 22).addBox(-5.0F, -11.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 22).addBox(-5.0F, -32.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-1.0F, -32.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 11).addBox(3.0F, -32.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(3.0F, -32.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 11).addBox(3.0F, -32.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-1.0F, -32.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-5.0F, -32.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -32.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arm_r1 = bb_main.addOrReplaceChild("arm_r1", CubeListBuilder.create().texOffs(16, 22).addBox(-22.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-18.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 11).addBox(-22.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-18.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(-18.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-14.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 11).addBox(-14.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-14.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 33).addBox(-22.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 33).addBox(-22.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 22).addBox(-18.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 33).addBox(-14.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-18.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 11).addBox(-22.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 40).addBox(-14.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 42).addBox(-22.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-18.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 44).addBox(-14.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition arm_r2 = bb_main.addOrReplaceChild("arm_r2", CubeListBuilder.create().texOffs(16, 44).addBox(-22.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 22).addBox(-14.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 44).addBox(-14.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 33).addBox(-14.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(-18.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 11).addBox(-18.0F, -15.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 44).addBox(-22.0F, -15.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 51).addBox(-18.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 22).addBox(-22.0F, -15.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 53).addBox(-22.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 33).addBox(-22.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 53).addBox(-18.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-14.0F, 7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 55).addBox(-22.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 55).addBox(-18.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 55).addBox(-14.0F, 7.0F, -5.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 0).addBox(-14.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 11).addBox(-18.0F, 7.0F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
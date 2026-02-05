// import CreatePassword from "./components/create_password";
// import LoginCard from "./components/login_card";
import SignupCard from "./components/signup_card";

export default function LandingPage() {
  return (
    <main
      className="min-h-screen relative flex text-slate-200"
      style={{
        backgroundImage: "url('/assets/images/background.jpg')",
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
      }}
    >
      {/* Dark Overlay */}
      <div className="absolute inset-0 bg-black/70" />

      {/* Content Wrapper */}
      <div className="relative z-10 flex w-full">
        {/* LEFT SECTION */}
        <section className="hidden md:flex w-3/5 flex-col justify-center px-18">
          <h1 className="text-7xl font-bold mb-4">
            <span className="text-amber-400">Bullion</span>-Broker
          </h1>

          <p className="text-xl text-slate-400 mb-6 max-w-xl">
            A mock gold & silver trading platform built to learn real-world
            onboarding flows, BFF architecture, and end-to-end product design.
          </p>

          <ul className="space-y-3 text-slate-400">
            <li>• Virtual Gold & Silver trading</li>
            <li>• Realistic onboarding & KYC flows</li>
            <li>• Frontend + BFF driven architecture</li>
          </ul>
        </section>

        {/* RIGHT SECTION */}
        {/* <LoginCard /> */}
        {/* <CreatePassword /> */}
        <SignupCard />
      </div>
    </main>
  );
}
